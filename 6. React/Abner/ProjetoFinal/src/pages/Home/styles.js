import styled from 'styled-components';

export const TopContainer = styled.div`
    display: flex;
    justify-content: center;
    padding: 10px;
`;

export const BottomContainer = styled.div`
    display: flex;
    flex-direction: column;
    justify-content: center;
    padding: 10px;
`;

export const Customers = styled.div`
    align-items: center;
    display: flex;
    flex-direction: row;
    justify-content: space-around;
    margin-bottom: 6px;

    img {
        height: 72px;
        width: 72px;
    }
`;

export const Title = styled.h1`
    font-size: 14px;
    font-weight: 300;
    margin: 20px 30px;
    text-align: center;
`;

export const Card = styled.div`
    border-radius: 30px;
    height: 113px;
    margin: 10px;
    width: 182px;

    .text-title {
        font-size: 14px;
        font-weight: 400;
        margin-left: 20px;
        margin-top: 14px;
    }
`;

export const Icon = styled.img`
    height: 78px;
    margin-left: 84px;
    width: 78px;
`;
