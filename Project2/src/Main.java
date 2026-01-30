void main() {
    byte age;

    System.out.println("Qual a sua idade?");
    Scanner getAge = new Scanner(System.in);
    age = getAge.nextByte();
    //passar para metodo
    if(age < 18){
        System.out.println("Menor de Idade");
    } else if (age <= 65) {
        System.out.println("Idade Ativa");
    } else {
        System.out.println("Aposentado");
    }
    System.out.println("A sua idade é: " + age);
}
