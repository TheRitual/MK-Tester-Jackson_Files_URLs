public class LaboratoryA {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Welcome to Laboratory 0");
        //writting lists to json file from hashmaps and arrays
        FileOperator.testOperation();

        System.out.println(NetFileReader.read("http://cognitus.theritual.eu/packages/testfile.txt"));
    }
}
