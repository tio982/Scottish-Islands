public class ArraysPlayground {
    public static void main(String[] args) {
        //String trainer1 = "Anna";
        //String trainer2 = "Colin";
        //String trainer3  = "Iain";

        //String[] trainers = { "Anna","Colin", "Iain"};

       // String firstTrainer = trainers[0];

        //System.out.println(firstTrainer);

        String[] emptyTrainers = new String[3];

        String firstTrainer = emptyTrainers[0];

        emptyTrainers[0] = "Anna";
        emptyTrainers[1] = "Colin";
        emptyTrainers[2] = "Iain";

        emptyTrainers[2] = "Zsolt";

        System.out.println(emptyTrainers[2]);

        int trainerCount = emptyTrainers.length;

        System.out.println(trainerCount);




    }
}
