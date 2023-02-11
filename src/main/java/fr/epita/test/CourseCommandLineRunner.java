package fr.epita.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository repo;

    //@Autowired
    //private CourseJdbcRepository repo;

    @Override
    public void run(String... args) throws Exception {

        //repo.insert(new Course(1,"Java","Tilak"));
        //repo.insert(new Course(2,".Net","Abhinandan"));
        //repo.insert(new Course(3,"C","Rajesh"));
        //repo.insert(new Course(4,"Networking","Niraj"));

        //repo.deleteById(1);

        System.out.println( repo.findById( 1 ));
        System.out.println( repo.findById( 2 ));
        System.out.println( repo.findById( 3 ));
    }
}
