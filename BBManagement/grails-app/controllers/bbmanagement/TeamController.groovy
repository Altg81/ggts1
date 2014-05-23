package bbmanagement

class TeamController {

    def index() { 
		[ player: Player.findAll() ]
	}
}
