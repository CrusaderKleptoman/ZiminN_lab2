public class TaskText {

    private String text;

    TaskText()
    {
        this.text = "";
    }

    TaskText(String text)
    {
        this.text = text;
    }


    public void getNumOfWord() {

        int spaceCount = 0;
        for (int i = 0; i < this.text.length(); i++) {
            if (this.text.charAt(i) == ' ')
            {
                spaceCount++;
            }
        }

        String[] textArray = new String[spaceCount + 1];

        int textArrayCount = 0;
        int firstSpace = 0;
        for (int i = 0; i < this.text.length(); i++) {

            if (this.text.charAt(i) == ' ' && firstSpace < i)
            {
                textArray[textArrayCount] = this.text.substring(firstSpace, i);
                textArrayCount++;
            }

            if (textArrayCount == spaceCount)
            {
                textArray[textArrayCount] = this.text.substring(i + 1, this.text.length());
                break;
            }

            if (this.text.charAt(i) == ' ')
            {
                firstSpace = i + 1;
            }
        }

        int numbOfBWord = 1;
        int numbOfSWord = 1;
        int symblInBWord = textArray[0].length();
        int symblInSWord = textArray[0].length();
        int count = 0;

        for (int i = 0; i < textArray.length; i++) {
            if (symblInSWord > textArray[i].length()) {
                symblInSWord = textArray[i].length();
                numbOfSWord = i + 1;
            }
            if (symblInBWord < textArray[i].length()) {
                symblInBWord = textArray[i].length();
                numbOfBWord = i + 1;
            }
        }

        if (numbOfBWord > numbOfSWord) {
            count = this.text.length() - numbOfSWord - (this.text.length() - numbOfBWord) - 1;
        } else if (numbOfBWord < numbOfSWord) {
            count = this.text.length() - numbOfBWord - (this.text.length() - numbOfSWord) - 1;
        }

        System.out.println("Количество слов = " + count);


    }

}
