import React from 'react';
import { Link } from 'react-router-dom';

import ListIcon from '../../assets/ListIcon.png';
import InsertUserIcon from '../../assets/InsertUser.png';
import FindOneIcon from '../../assets/FindOne.png';

import {
    HeaderContainer,
    TopButton,
    BottomButton
} from './styles';

const Header = () => {
    return (
        <HeaderContainer>
            <TopButton>
                <Link to='/'>
                    <img src={ListIcon} alt='' />
                </Link>
            </TopButton>
            <TopButton>
                <Link to='/signup'>
                    <img src={InsertUserIcon} alt='' />
                </Link>
            </TopButton>
            <BottomButton>
                <Link to='/user'>
                    <img src={FindOneIcon} alt=''/>
                </Link>
            </BottomButton>
        </HeaderContainer>
    );
}

export default Header;