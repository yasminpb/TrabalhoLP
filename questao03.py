nome = []
idade = []
for i in range(3):
    nome.append(input(f'Digite o {i+1}ª nome'))
    idade.append(input(f'Digite a {i+1}ª idade'))
    
print(f'Pessoa mais velha: {max(nome)}')


