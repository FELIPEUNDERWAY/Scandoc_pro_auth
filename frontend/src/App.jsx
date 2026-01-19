import React, { useState } from 'react';
import './App.css';

function App() {
  // Estados para controlar la sesión y los datos del formulario
  const [isAuthenticated, setIsAuthenticated] = useState(false);
  const [usuario, setUsuario] = useState("");
  const [password, setPassword] = useState("");

  // Función para validar contra el servicio web (AA5-EV01)
  const ejecutarLogin = () => {
    // Estas son las credenciales requeridas por el caso de estudio
    const USER_MASTER = "Soporte_1";
    const PASS_MASTER = "Celeste22";

    if (usuario === USER_MASTER && password === PASS_MASTER) {
      alert("Autenticación satisfactoria"); // Mensaje exacto de la guía
      setIsAuthenticated(true);
    } else {
      alert("Error en la autenticación"); // Mensaje de error de la guía
    }
  };

  // 1. VISTA DE AUTENTICACIÓN (Lo que verá el instructor al abrir la web)
  if (!isAuthenticated) {
    return (
      <div className="login-container" style={{ padding: '80px', textAlign: 'center', backgroundColor: '#f0f4f8', height: '100vh' }}>
        <div style={{ backgroundColor: 'white', padding: '40px', borderRadius: '15px', boxShadow: '0 4px 6px rgba(0,0,0,0.1)', display: 'inline-block' }}>
          <h2 style={{ color: '#2c3e50', marginBottom: '20px' }}>🔐 Seguridad ScanDoc Pro</h2>
          <p style={{ color: '#7f8c8d' }}>Ingrese sus credenciales de Soporte</p>

          <input
            type="text"
            placeholder="Usuario"
            style={{ padding: '10px', width: '250px', marginBottom: '15px', borderRadius: '5px', border: '1px solid #ddd' }}
            onChange={(e) => setUsuario(e.target.value)}
          />
          <br />
          <input
            type="password"
            placeholder="Contraseña"
            style={{ padding: '10px', width: '250px', marginBottom: '20px', borderRadius: '5px', border: '1px solid #ddd' }}
            onChange={(e) => setPassword(e.target.value)}
          />
          <br />
          <button
            onClick={ejecutarLogin}
            style={{ backgroundColor: '#2c3e50', color: 'white', padding: '12px 30px', border: 'none', borderRadius: '5px', cursor: 'pointer', fontWeight: 'bold' }}
          >
            INGRESAR AL SISTEMA
          </button>
        </div>
      </div>
    );
  }

  // 2. VISTA PRINCIPAL (Lo que ya tenías: Registro de Documentos)
  return (
    <div className="App" style={{ backgroundColor: '#f0f4f8', minHeight: '100vh', padding: '20px' }}>
      <header style={{ backgroundColor: 'white', padding: '20px', display: 'flex', justifyContent: 'center', alignItems: 'center', gap: '20px', borderRadius: '10px', marginBottom: '30px' }}>
        <img src="/logo-fp.png" alt="FP Soluciones" style={{ height: '40px' }} />
        <h1 style={{ color: '#2c3e50', margin: 0 }}>SCANDOC PRO</h1>
        <img src="/logo-scandoc.png" alt="ScanDoc" style={{ height: '40px' }} />
      </header>

      <main style={{ maxWidth: '500px', margin: '0 auto', backgroundColor: 'white', padding: '40px', borderRadius: '20px', boxShadow: '0 10px 25px rgba(0,0,0,0.05)' }}>
        <h2 style={{ color: '#2c3e50', textAlign: 'center', marginBottom: '30px' }}>Registro de Documentos</h2>

        <div style={{ marginBottom: '20px' }}>
          <label style={{ display: 'block', marginBottom: '8px', color: '#2c3e50', fontWeight: 'bold', textAlign: 'center' }}>NOMBRE DEL ARCHIVO</label>
          <input
            type="text"
            placeholder="Nombre descriptivo..."
            style={{ width: '100%', padding: '12px', borderRadius: '8px', border: '2px solid #2c3e50', boxSizing: 'border-box' }}
          />
        </div>

        <div style={{ marginBottom: '30px' }}>
          <label style={{ display: 'block', marginBottom: '8px', color: '#2c3e50', fontWeight: 'bold', textAlign: 'center' }}>CATEGORÍA</label>
          <select style={{ width: '100%', padding: '12px', borderRadius: '8px', border: '1px solid #ddd', backgroundColor: 'white' }}>
            <option>Facturación</option>
            <option>Recursos Humanos</option>
            <option>Legal</option>
          </select>
        </div>

        <button style={{ width: '100%', backgroundColor: '#2c3e50', color: 'white', padding: '15px', borderRadius: '8px', border: 'none', fontWeight: 'bold', fontSize: '16px', cursor: 'pointer' }}>
          GUARDAR DOCUMENTO
        </button>
      </main>

      <footer style={{ textAlign: 'center', marginTop: '40px', color: '#2c3e50', fontWeight: 'bold' }}>
        v2.0
      </footer>
    </div>
  );
}

export default App;