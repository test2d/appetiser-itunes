package au.com.appetiser.itunes.di.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface ForService {
}