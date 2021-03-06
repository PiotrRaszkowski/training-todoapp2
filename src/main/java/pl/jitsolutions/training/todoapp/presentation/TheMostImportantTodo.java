package pl.jitsolutions.training.todoapp.presentation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Target({FIELD, METHOD})
@Retention(RUNTIME)
public @interface TheMostImportantTodo {
}
