import styled from 'styled-components';

export const Container = styled.div`
    display: flex;
    max-width: 80%; 
    margin-bottom: 50px;  
    height: auto;
    margin: auto;      
`;

export const LeftSide = styled.div`   
    width: 50%;  
    height: auto;
    img{
        margin-top:443px;
        width: 100%
    }
`;

export const RightSide = styled.div`     
    width: 50%;   
    height: auto;
    h2{
       margin: auto;
    }
`;

export const Titleform = styled.div`    
    width: 100%;
    height: auto;
    h2{   
        margin-top: 200px;     
        font-size: 48px;
        text-align: center;              
    }
`;

export const Form = styled.form`     
    flex-direction: column;
    display: flex;     

    input{
        border-radius: 20px; 
        border-style: none;
        background-color: #E5E5E5;       
        width: 70%;
        height: 46px;
        margin: auto;
        margin-top: 30px; 

        ::placeholder{
            font-size: 1.5rem;
            padding-left: 1.5rem;
        } 

        &[type="date"]{
            font-size: 1.0rem;            
            font-weight: bold;
            color: #8C8C8C;                       
        }
    }

    button{
        width: 180px;
        height: 61px;             
        border-radius: 30px;
        border-style: none;
        font-size: 24px;
        margin: auto; 
        margin-top: 30px; 
        background-color: #C4C4C4;
        &:hover{
            background-color: #E5E5E5;
        }                              
    }    
`;
