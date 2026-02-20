class aula {
    public static void main(String[] args) {
        String userName = "JSmith13";
        int userNameLength = userName.length();
    }
}

class StringMethods {
    public static void main(String[] args) {
        String yes = "yes";
        //toLowerCase
        System.out.println(yes.toLowerCase());
        // ou
        //toUpperCase
        System.out.println(yes.toUpperCase());
        }
}

// Array
//Declarando variavel
int[] prices;
//Atribuindo valores
prices = new int[] {10, 20, 30, 40};
// OU
int[] prices = {10, 20, 30, 40};

//Para acessar valores do array

//Acessando primeiro elemento
int firstElement = prices[0]; // Valor = 10
//Acessando segundo elemento
int secondElement = prices[1]; // Valor = 20