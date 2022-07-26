import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';
import './index.css';

// Linha para resolver o erro no SMS na aplicação do Netlify (tela preta / erro):
window.React = React

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
)
