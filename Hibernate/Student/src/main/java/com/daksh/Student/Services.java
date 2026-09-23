package com.daksh.Student;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.daksh.Student.util.Sessionbuilder;
import com.daksh.Student.entities.Student;

public class Services {

    static SessionFactory sessionfactory =
            Sessionbuilder.getSessionFactory();

    // INSERT
    public static void insert(Student s1) {

        try (Session session = sessionfactory.openSession()) {

            Transaction transaction =
                    session.beginTransaction();

            session.persist(s1);

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE CITY
    public static void update(int id, Student s1) {

        try (Session session = sessionfactory.openSession()) {

            Transaction transaction =
                    session.beginTransaction();

            Student currstudent =
                    session.get(Student.class, id);

            if (currstudent != null) {
                currstudent.setCity(s1.getCity());
            }

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String viewall() {

        try (Session session = sessionfactory.openSession()) {

            List<Student> list =
                    session.createQuery("FROM Student", Student.class)
                           .getResultList();

            return list.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
    }
    // VIEW ONE STUDENT
    public static void view(int id) {

        try (Session session = sessionfactory.openSession()) {

            Student currstudent =
                    session.get(Student.class, id);

            if (currstudent != null) {

                System.out.println("ID   : " +
                        currstudent.getId());

                System.out.println("Name : " +
                        currstudent.getName());

                System.out.println("City : " +
                        currstudent.getCity());

            } else {

                System.out.println(
                        "Student not found with id: " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void delete(int id) {

        try (Session session = sessionfactory.openSession()) {

            Transaction transaction =
                    session.beginTransaction();

            Student currstudent =
                    session.get(Student.class, id);

            if (currstudent != null) {
                session.remove(currstudent);
            }

            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}