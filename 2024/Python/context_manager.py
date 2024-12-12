"""
    A Context Manager is an object that
    handle resources (files, sockets, server and database calls etc..)
    from their opening to there closing and cleanup.
    
    The traditional try-catch-finally blocks handle
    opening, errors and closing, respectively.
    Instead, we can use the 'with' keyword mixed with 'as',
    to create a context manager object and pipeline its resource
    into a variable.
    
    with ContextManager() as resVar
    
    Python gives us a convenient syntax for creating context-manager objects,
    that manage resources head to tail. These object are being executed
    by the with-as syntax.
    Two built-in methods take all the code of the opening and closing
    processes:
    __init__() - constructor create the object after the 'with' keyword.
    __enter__() - executed by the 'as' keyword, open a resource and return it to a variable.
    __exit__() - executed when the 'with' block is finished, to close the resource.
 """
 
 
class ContextManagerTemplate:
    def __init__(self, param1, param2):
        """ constructor for initialization.
        here we can receive arguments that 
        define a single object's resource. """
        pass
    
    def __enter__(self):
        """ Here, we make all arrangements for opening
        and preparing the resource.
        Handle files, allocate memory, or connect servers and
        databases.
        
        This method should return the resource object,
        to match the with-as syntax. """
        pass
    
    def __exit__(self, exc_type, exc_value, traceback):
        """ In this method we close the resource/s,
        deallocate memory etc..
        This method executed at the end of the 'with' block,
        as a final procedure. """
        pass
    

class FileContextManager:
    def __init__(self, fileName):
        self.f = None
        self.fName = fileName
    
    def __enter__(self):
        self.f = open(self.fName, "wt")
        return self.f
    
    def __exit__(self, exc_type, exc_value, traceback):
        if self.f:
            self.f.close()



if __name__ == '__main__':
    with FileContextManager("out") as output:
        output.write("hello world")
    print("File closed!")