package aula5.t05enumeration.e03enumwithabstractmethod;

/**
 *
 * @author Eldair
 */
public enum WeekDay {
    SUNDAY(0, "Sun") {
        @Override
        public String getMessage() {
            return "Sunday is not a good to work!";
        }
    }, MONDAY(1, "Mon") {
        @Override
        public String getMessage() {
            return "Monday is not so bad for work!";
        }
    }, TUESDAY(2, "Tue") {
        @Override
        public String getMessage() {
            return "Tuesday is a good day to word!";        }
    },
    WEDNESDAY(3, "Wed") {
        @Override
        public String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, THURSDAY(4, "Thu") {
        @Override
        public String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }, FRIDAY(5, "Fri") {
        @Override
        public String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    },
    SATURDAY(6, "Sat") {
        @Override
        public String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };

    private int value;
    private String shortCode;

    private WeekDay(int value, String shortCode) {
        this.value = value;
        this.shortCode = shortCode;
    }

    public abstract String getMessage();

    public int getValue() {
        return value;
    }

    public String getShortCode() {
        return shortCode;
    }

}
