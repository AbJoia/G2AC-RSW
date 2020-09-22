import React from 'react';

import Header from '../../components/Header';

import {
    RightBarContainer,
    Name,
    Info,
    ListContainer,
    InfoList,
    AddressList,
    RightBarContent
} from './styles.js';

const User = () => {
    return (
        <>
            <Header />
            <RightBarContainer>
                <RightBarContent>
                    <Name>
                        <h1>Cainã Machado</h1>
                    </Name>
                    <Info>
                        <ListContainer>
                            <InfoList>
                                <li>Nome de usuário</li>
                                <li>CPF</li>
                                <li>Data de Nascimento</li>
                                <li>Email</li>
                            </InfoList>
                            <h4>Endereço:</h4>
                            <AddressList>
                                <li>Rua</li>
                                <li>Número</li>
                                <li>Bairro</li>
                                <li>Cidade</li>
                                <li>Estado</li>
                                <li>Complemento</li>
                                <li>CEP</li>
                            </AddressList>
                        </ListContainer>
                    </Info>
                </RightBarContent>
            </RightBarContainer>
        </>
    );
}

export default User;
