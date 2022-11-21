import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App'
import './index.css'

window.React = React

//Processo de Renderização do projeto (root = index.html)
ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
)
