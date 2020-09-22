import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';

import Global from './styles/global';
import Home from './pages/Home/Home';

function App() {
  return (
    <BrowserRouter>
      <Switch>
        <Route>
          <Home path="/" exact component={Home}/>
        </Route>
      </Switch>
      <Global />
    </BrowserRouter>
  );
}

export default App;