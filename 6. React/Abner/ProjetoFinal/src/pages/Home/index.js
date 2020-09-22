import React from 'react';
import Header from '../../components/Header';

import { Title, Card, Icon, TopContainer, BottomContainer, Customers} from './styles';
import AccountIcon from '../../assets/account.svg';
import Profile from '../../assets/profile.svg';

const Dashboard = () => {
  return (
    <>
      <Header />
      <Title>Informações</Title>
      <TopContainer>
          <Card style={{ backgroundColor: "#FAD3D3" }}>
            <p className="text-title">Total de Clientes</p>
            <Icon src={AccountIcon} />
          </Card>
          <Card style={{ backgroundColor: "#D3FADC" }}>
            <p className="text-title">Clientes Ativos</p>
            <Icon src={AccountIcon} />
          </Card>
          <Card style={{ backgroundColor: "#D3F3FA" }}>
            <p className="text-title">Clientes Inativos</p>
            <Icon src={AccountIcon} />
          </Card>
          <Card style={{ backgroundColor: "#E4D3FA" }}>
            <p className="text-title">Contas excluídas</p>
            <Icon src={AccountIcon} />
          </Card>
      </TopContainer>
      <BottomContainer>
        <Title>Clientes</Title>
        <Customers>
          <img src={Profile} alt="" />
          <p className="text-title">João da Silva</p>
          <p className="text-title">joaozinholouco@gmail.com</p>
        </Customers>
        <Customers>
          <img src={Profile} alt="" />
          <p className="text-title">João da Silva</p>
          <p className="text-title">joaozinholouco@gmail.com</p>
        </Customers>
      </BottomContainer>
    </>
  );
}

export default Dashboard;