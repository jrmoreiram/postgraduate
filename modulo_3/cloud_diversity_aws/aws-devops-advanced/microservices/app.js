const AWSXRay = require('aws-xray-sdk');
const express = require('express');
const app = AWSXRay.express.openSegment('SampleApp');

app.get('/', (req, res) => {
  const segment = AWSXRay.getSegment();
  segment.addAnnotation('route', '/');
  
  res.json({
    message: "Microserviço Avançado com X-Ray!",
    environment: process.env.NODE_ENV || 'dev',
    traceId: segment.trace_id
  });
});

app.use(AWSXRay.express.closeSegment());

const port = process.env.PORT || 8080;
app.listen(port, () => {
  console.log(`Microserviço rodando na porta ${port}`);
});
