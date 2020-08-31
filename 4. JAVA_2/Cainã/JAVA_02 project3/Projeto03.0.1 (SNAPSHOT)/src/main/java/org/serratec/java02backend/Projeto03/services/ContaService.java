package org.serratec.java02backend.Projeto03.services;

import java.util.ArrayList;
import java.util.List;

import org.serratec.java02backend.Projeto03.entity.Conta;
import org.serratec.java02backend.Projeto03.exception.IdInvalidoException;
import org.serratec.java02backend.Projeto03.exception.OperacaoInvalidaException;
import org.serratec.java02backend.Projeto03.exception.ValorInvalidoException;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

	List<Conta> contas = new ArrayList<>();
	private int contador;

	public ContaService() {
		super();
	}

	private Conta debito(double valor, Conta conta) throws ValorInvalidoException {
		if (valor < conta.getSaldo()) {
			conta.setSaldo(conta.getSaldo() - valor);
			return conta;
		}
		throw new ValorInvalidoException(valor);
	}

	private Conta credito(double valor, Conta conta) throws ValorInvalidoException {
		if (valor > 0) {
			conta.setSaldo(conta.getSaldo() + valor);
			return conta;
		}
		throw new ValorInvalidoException(valor);
	}

	public Conta realizaOperacao(int id, String op, double valor) throws ValorInvalidoException, OperacaoInvalidaException, IdInvalidoException {
		if (op.equals("debito")) {
			return debito(valor, achaConta(id));
		} else if (op.equals("credito")) {
			return credito(valor, achaConta(id));
		}
		throw new OperacaoInvalidaException(op);
	}

	public List<Conta> getAllContas() {
		return this.contas;
	}

	public Conta getUmaConta(int id) throws IdInvalidoException {
		return achaConta(id);
	}

	public Conta insertConta(Conta conta) {
		conta.setId(++contador);
		contas.add(conta);
		return conta;
	}

	public Conta updateConta(int id, Conta newConta) throws IdInvalidoException {
		achaConta(id).setTitular(newConta.getTitular());
		achaConta(id).setId(newConta.getId());
		return achaConta(id);
	}

	public Conta deleteConta(int id) throws IdInvalidoException {
		contas.remove(achaConta(id));
		return achaConta(id);
	}

	private Conta achaConta(int id) throws IdInvalidoException {
		for (Conta conta : contas) {
			if (id == conta.getId()) {
				return conta;
			}
		}
		throw new IdInvalidoException(id);
	}
}
