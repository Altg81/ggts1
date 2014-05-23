import bbmanagement.Team
import bbmanagement.Player


class BootStrap {

    def init = { servletContext ->
		def t = new Team(name:"keos team")
		def p = new Team(name:"pepe") 
    }
    def destroy = {
    }
	
}
