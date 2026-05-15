const express = require('express');
const app = express();
const port = process.env.PORT || 80;

app.get('/', (req, res) => {
  res.json({
    message: "Bem-vindo ao exemplo de DevOps na AWS!",
    status: "Online",
    timestamp: new Date().toISOString(),
    version: "1.0.0"
  });
});

app.get('/health', (req, res) => {
  res.status(200).send('OK');
});

app.listen(port, () => {
  console.log(`Aplicação rodando na porta ${port}`);
});
