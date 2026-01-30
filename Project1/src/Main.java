void main() {
    String name;
    byte age;
    double height;
    boolean job;

    System.out.println("Qual é o seu nome?");
    Scanner getName = new Scanner(System.in);
    name = getName.nextLine();
    System.out.println("Qual é a sua idade?");
    Scanner getAge = new Scanner(System.in);
    age = getAge.nextByte();
    System.out.println("Qual é a sua altura?");
    Scanner getHeight = new Scanner(System.in);
    height = getHeight.nextDouble();
    System.out.println("Você está empregado?");
    Scanner getJob = new Scanner(System.in);
    job = getJob.nextBoolean();

    System.out.printf(
            "Nome: %s%nIdade: %d%nAltura: %.2f%nEmpregado: %b%n",
            name, age, height, job
    );
}
