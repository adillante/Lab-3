public class Task5 {

    public static void main(String[] args) {

        int counter = 1;

        int randomNumber = (int) (Math.random() * 100) + 1;

        int smallest = randomNumber;
        int largest = randomNumber;

        System.out.println("Drawn number: " + randomNumber);

        while (counter < 10) {

            randomNumber = (int) (Math.random() * 100) + 1;

            System.out.println("Drawn number: " + randomNumber);

            if (randomNumber > largest) {
                largest = randomNumber;
            }

            if (randomNumber < smallest) {
                smallest = randomNumber;
            }

            counter++;
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Smallest number = " + smallest);
    }
}