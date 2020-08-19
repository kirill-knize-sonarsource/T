myvar = "this is a multiline"
"message from {}".format(sender)  # Noncompliant. The formatted string is not used because the concatenation is not done properly.


def func(a, b, c):
    return a * b * c

func(6, 93, 31, c=62) # Noncompliant: argument "c" is duplicated

params = {'c':31}
func(6, 93, 31, **params) # Noncompliant: argument "c" is duplicated
func(6, 93, c=62, **params) # Noncompliant: argument "c" is duplicated