import static org.junit.jupiter.api.Assertions.*;


class QuizTest{

    @org.junit.jupiter.api.Test
    void numberOfVowels() {
        String one = "let him cook";
        String two = "relax, you're doing fine";
        String three = "aaaaah!!!";
        assertTrue(Quiz.numberOfVowels(one) == 4);
        assertTrue(Quiz.numberOfVowels(two) == 9);
        assertTrue(Quiz.numberOfVowels(three) == 5);
    }

    @org.junit.jupiter.api.Test
    void notDivisible() {
        assertTrue(Quiz.notDivisibleBy235(5) == 1);
        assertTrue(Quiz.notDivisibleBy235(10) == 2);
        assertTrue(Quiz.notDivisibleBy235(100) == 26);
        assertTrue(Quiz.notDivisibleBy235(1000) == 266);
    }

    @org.junit.jupiter.api.Test
    void toCamelCase() {
        String one = "the-stealth-warrior";
        String two = "The_Stealth_Warrior";
        String three = "The_Stealth-Warrior";
        String four = "-no_shot_bruh_";
        assertTrue(Quiz.camelCaseMe(one).equals("theStealthWarrior"));
        assertTrue(Quiz.camelCaseMe(two).equals("TheStealthWarrior"));
        assertTrue(Quiz.camelCaseMe(three).equals("TheStealthWarrior"));
        assertTrue(Quiz.camelCaseMe(four).equals("NoShotBruh"));
    }

}