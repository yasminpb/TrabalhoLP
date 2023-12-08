nota1 = int(input("Informe a sua nota entre (0 a 100):"))
nota2 = int(input("Informe a sua nota entre (0 a 100):"))
media = (nota1 + nota2) / 2
if media >= 70 :
 print(f'Aprovado')
elif (media >=40):
  print(f'Terá que fazer exame final')
  notaFinal = int(input("Informe a nota do exame Final: "))
  media + notaFinal / 2
  if (media + notaFinal / 2 >= 100):
    print(f'Aprovado!!!!!')
else :
  (media + notaFinal / 2 < 100):
  print(f'Reprovado')


