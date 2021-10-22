package geometria;
//Definindo a classe Quadrado como a classe final.
final class Quadrado extends Geometria {//Herdando as características da classe Geometria.
    Quadrado(double lado){
    super();
}
@Override//Sobrescrevendo o método area.
    public double area(){
        return 200;
}
@Override
    public double perimetro(){
        //
    return 0;
}
}