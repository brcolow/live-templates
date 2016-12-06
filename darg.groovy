// Template text: $ARGUMENTS$

// Template variables:
// Name: ARGUMENTS
// Expression:
groovyScript("_1.collect { 'logger.debug(\"' + it + ': \" + ' + it + ');' }.join('\\n') ", methodParameters())