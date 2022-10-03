package ap_2014_3;

import java.util.List;

public class SeatingChart {

    private final Student[][] seats;

    public SeatingChart(List<Student> studentList, int rows, int cols) throws IllegalArgumentException {
        if (rows * cols < studentList.size())
            throw new IllegalArgumentException("rows * cols must be >= studentsList size");
        if (rows < 0 || cols < 0)
            throw new IllegalArgumentException("count of rows and columns must be bigger than zero");

        seats = new Student[rows][cols];

        // represent students in the students seating arrangement
        int currentRow = 0;
        int currentCol = 0;
        for (Student current : studentList) {
            // adding student in field and move to next field
            seats[currentRow][currentCol] = current;
            currentRow++;

            // if current row hasn't free fields
            if (currentRow >= rows) {
                currentCol++;
                currentRow = 0;
            }
        }
    }

    /**
     * Removes students from table which has absences more than specified number
     *
     * @param allowedAbsences students will be deleted by this number
     * @return count of removing students
     */
    public int removeAbsenceStudents(int allowedAbsences) {
        int countRemoved = 0;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] != null &&
                        seats[i][j].getAbsenceCount() > allowedAbsences) {
                    seats[i][j] = null;
                    countRemoved++;
                }
            }
        }

        return countRemoved;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Student[] row : seats) {
            for (int j = 0; j < row.length; j++) {
                if (j == 0) builder.append("|");

                if (row[j] == null) builder.append("null");
                else builder.append(row[j]);

                builder.append("|");
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
