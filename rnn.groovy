// Template text: $ARGUMENTS$

// Template variables:
// Name: ARGUMENTS$
// Expression:
groovyScript("_1.collect { 'java.util.Objects.requireNonNull(' + it + ', \"' + it + ' must not be null\");' }.join('\\n') ", methodParameters())