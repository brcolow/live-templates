// Template text: 
@Override
public boolean equals(Object object)
{
    if (object == this)
    {
        return true;
    }

    if (object == null || object.getClass() != getClass())
    {
        return false;
    }

    $TYPE$ other = ($TYPE$) object;

    return java.util.Objects.equals($END$
}
// Template variables:
// Name: TYPE
// Expression: className()