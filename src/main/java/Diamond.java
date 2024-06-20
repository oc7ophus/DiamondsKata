public class Diamond {

    public String generate(int inputSize) {

        if (inputSize == 1) { return "*"; }
        if (inputSize < 1) { return "null"; }
        if (inputSize % 2 == 0) { return "null"; }

        int layerHalfway = (inputSize / 2) + 1;

        String output = "X";

        for (int i = 1; layerHalfway - 1 >= i; i++) { // 1 2 3 ... -> end before halfway
            String fillOutput = fill(layerHalfway - i, (2 * i) - 1) + "\n";
            output = output.replace("X",fillOutput + "X" + fillOutput);
        }

        output = output.replace("X", fill(0, inputSize) + "\n");

        return output;
    }

    public String fill(int numberOfSpaces, int numberOfAsterisks) {
        return " ".repeat(Math.max(0, numberOfSpaces)) +
                "*".repeat(Math.max(0, numberOfAsterisks));
    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        int size = 9;

        String generatedDiamond = diamond.generate(size);
        System.out.println(generatedDiamond);
        System.out.println("Diamond size " + size + ": " + "\"" + generatedDiamond.replaceAll("\n", ("\\\\n")) + "\"");
    }
}
