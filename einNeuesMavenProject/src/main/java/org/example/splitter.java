package org.example;

    import com.google.common.base.Splitter;

    public class splitter {
        public static void main(String[] args) {
            String input = "Harry, Ron, , Sirius,Hermine, ";

            Iterable<String> splitted = Splitter.on(',')
                    .omitEmptyStrings()
                    .trimResults()
                    .split(input);

            for (String s : splitted) {
                System.out.println(s);
            }
        }

}
