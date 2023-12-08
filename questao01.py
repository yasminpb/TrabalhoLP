velocidade = int (input("Qual a velocidade máxima em uma avenida?"))
velocidadepermitida = int (input("Qual a velocidade máxima do motorista?"))
excessodevelocidade = velocidadepermitida - velocidade
multa = excessodevelocidade * 5.00
print(f' O excesso de velocidade é {excessodevelocidade}')
print(f' A multa é {multa}')

if velocidade <=  velocidadepermitida :
    print('Não há excesso de velocidade')

