package model;

public class Student {
        private String universityId;
        private String fullName;
        private String faculty;
        private int currentCourseNumber;
        private float avgExamScore;

        public Student() {
        }

        public String getFullName() {
            return fullName;
        }

        public Student setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public String getfaculty() {
            return faculty;
        }
    public String getUniversityId() {
        return universityId;
    }
    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

        public Student setfaculty(String faculty) {
            this.faculty = faculty;
            return this;
        }

        public int getCurrentCourseNumber() {
            return currentCourseNumber;
        }

        public Student setCurrentCourseNumber(int currentCourseNumber) {
            this.currentCourseNumber = currentCourseNumber;
            return this;
        }

        public float getAvgExamScore() {
            return avgExamScore;
        }

        public Student setAvgExamScore(float avgExamScore) {
            this.avgExamScore = avgExamScore;
            return this;
        }

        @Override
        public String toString() {
            return String.format("fullName = %s, faculty = %s, currentCourseNumber = %s, avgExamScore = %s",
                    this.universityId,
                    this.fullName,
                    this.faculty,
                    this.currentCourseNumber,
                    this.avgExamScore);
        }
    }

