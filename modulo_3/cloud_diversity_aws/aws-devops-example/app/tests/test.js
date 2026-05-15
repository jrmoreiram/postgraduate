const chai = require('chai');
const expect = chai.expect;

describe('Testes Básicos da Aplicação', () => {
  it('Deve retornar verdadeiro para teste de sanidade', () => {
    expect(true).to.equal(true);
  });

  it('A versão deve ser 1.0.0', () => {
    const version = "1.0.0";
    expect(version).to.equal("1.0.0");
  });
});
