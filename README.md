# PDS 2023 Practical classes

## Teachers
- José Luís Oliveira - jlo@ua.pt
- Carlos Costa - carlos.costa@ua.pt
- José Moreira - jose.moreira@ua.pt
- Rafael Direito - rafael.neves.direito@ua.pt





















Escrever um programa para criar, visualizar e validar geometrias 2D em java que podem ser pontos, poligonos ou geometrias compostas, tendo em atenção os requisitos:
ponto: definido por par de coordenadas (x,y).
poligono: lista de pontos que definem as coordenadas dos vertices do poligono
geometria composta: composta por pontos, poligonos e outras geometrias compostas.
Os pontos, poligonos e as geometrias compostas devem implementar o metodo void draw() e isValid().
Considerar que os pontos são sempre válidos se as coordenadas forem positivas.
Os poligonos são fechados, logo devem ter 4 ou mais pontos e as coordenadas do último ponto devem ser iguais ao primeiro.
Criar as classes java para representar poligonos usando Factory method.
Para testar as classes deve criar 5 pontos e 2 poligonos. Os vertices do primeiro poligono são definidos pelos pontos 3,4,1,2,3 (esta numeração segue a ordem de criação dos pontos).
Os vértices do segundo poligono são definidos pelos pontos 3,5,4 logo este ponto é inválido.
