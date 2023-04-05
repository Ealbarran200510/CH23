import logo from './logo.svg';
import './App.css';
import Component1 from './components/component1';
import Component2 from './components/Component2';
import Component3 from './components/Component3';
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {

  const data = {

    country: "Mex",
    state: "Querétaro"

  }

  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />

        <p>
          Hola
        </p>
        <hr/>
        <div className='components'>
          <Component1 />
          <hr />
          <Component3 />
        </div>

        <BrowserRouter>
          <Routes>
            <Route path='/' element={<div>Hola Route</div>} />
            <Route path='/endpoint' element={<div>Hola Route Endpoint</div>} />
            <Route path='/Page1' element={<div>Hola Route Endpoint Page 1</div>} />
          </Routes>
        </BrowserRouter>

      </header>
    </div>
  );
}

export default App;

// <Component2 nombre="Nombre" apellido="Apellido 1" info = {data} />