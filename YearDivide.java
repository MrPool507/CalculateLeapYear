package Test;

//Java program to find if a number is
//divisible by 4 or not
class YearDivide
{
 // Function to find that number
 // is divisible by 4 or not


    // Class describes the effects of an earthquake
        // (To demonstrate use of Code Coverage Tool)

        // Attributes
        private int year;


        public void year(int a) {

            year = a;
        }

        // Method
        // Gets and returns a description of the effects of the earthquake

        static boolean check(String str)
        {
            int n = str.length();
     
            // Empty string
            if (n == 0)
                return false;
     
            // If there is single digit
            if (n == 1)
                return ((str.charAt(0) - '0') % 4 == 0);
     
            // If number formed by last two digits is
            // divisible by 4.
            int last = str.charAt(n - 1) - '0';
            int second_last = str.charAt(n - 2) - '0';
            return ((second_last * 10 + last) % 4 == 0);
        }
        public String getDescription()
        {

            String leapyear;
            try {
                if (year >= 1582 && year<= 10000)
                    leapyear = "invalid year";
               
            }
            catch(Exception e)
            {
                leapyear=e.getMessage();
            }

            return leapyear;

        }
}
