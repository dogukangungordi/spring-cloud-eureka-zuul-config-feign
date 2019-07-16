# spring-cloud-eureka-zuul-config-feign

# Eureka Server = http://localhost:8761/  

# Config Server = http://localhost:8888/

# Student Client = http://localhost:8098/getStudentDetailsForSchool/abcschool
# School Client (Feign -> Student Client) = http://localhost:9098//getSchoolDetails/abcschool

# Zuul : http://localhost:8762/
# Zuul -> Student Client = http://localhost:8762/student-service/greeting
# Zuul -> School Client(Feign ->Student Client) = http://localhost:8762/school-service/get-greeting

