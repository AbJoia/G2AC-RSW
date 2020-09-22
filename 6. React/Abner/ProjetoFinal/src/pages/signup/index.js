import React, {useState} from 'react';
import Img from '../../assets/imgCadastro.svg';
import FormStep1 from '../form/FormStep1';
import FormStep2 from '../form/FormStep2';
import Header from '../../components/Header';


import {
    Container,
    LeftSide,
    RightSide,
    Titleform,
    Form,
} from './styles';

const cadastro = () => {

    const [form, setForm] = useState(1);
    console.log(form);

    const handleFormChange = (e) =>{
        e.preventDefault();
        if(form === 1){
            setForm(2);
        }else{
            setForm(1);
        }
        
    }        
    
    return(
       <Container>
            <Header />
           <LeftSide>
                <img src={Img} alt="" />
           </LeftSide>
           <RightSide>
               <Titleform>
                   <h2>Cadastro</h2>
               </Titleform>
               <Form>   
                  {form === 1 ? <FormStep1 /> : <FormStep2 /> }                                                     
                   <button onClick={handleFormChange}>Proximo</button> 
                   <button onClick={handleFormChange}>Voltar</button>                            
               </Form>
           </RightSide>
       </Container>
    );
}

export default cadastro;