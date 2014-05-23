package bbmanagement

class PlayerController {

    def index() {
		 
			[ team: Team.findAll() ]
		 
	}
}
