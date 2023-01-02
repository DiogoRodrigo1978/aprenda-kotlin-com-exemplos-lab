// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Level { BASIC, INTERMEDIARY, ADVANCED }
enum class Post { STUDENT, TEACHER }

data class Users(val fNome: String, val lNome: String, val email: String, val post: Post)

data class EducationalContent(val name: String, val duration: Int, val level: Level)

data class Users2( val fNome: String, val lNome: String)

data class Formation(val nome: String, val contents: List<EducationalContent>, val level: Level) {

    val registered = mutableListOf<Users>()
    
   
    fun addUser(user: Users) {
         registered.add(user)
    }
   
    fun getAddUser(){
        for(user in registered){
            println("|Nome: ${user.fNome+" "+user.lNome}| - |Email: ${user.email}| - (${user.post})")
        }
    }
    
    fun getAddUsers2(){
        for(user in registered){
            println("|Nome: ${user.fNome+" "+user.lNome}|")
        }
    }
   
    fun printEducationalContent(){
        for(cont in contents){
            println("${cont.name} - ${cont.duration}min - (${cont.level})")
        }
    }
}

fun main() {
    val moduleBoasVindas = EducationalContent("Boas vindas", 11, Level.BASIC)
    val moduleInstalacao = EducationalContent("Instalação e configuração do Kotlin para Windows, MAC e Linux ", 15, Level.BASIC)
 	val moduleKotlinB = EducationalContent("Linguagem Kotlin", 60, Level.BASIC)
    val moduleInstalacaoB = EducationalContent("Instalação e configuração do Android Studio para Windows, MAC e Linux ", 19, Level.BASIC)
    val moduleAndroidStudioB = EducationalContent("Fundamentos Android Studio", 90, Level.BASIC)
    val moduleApp = EducationalContent("Criando seu primeiro APP no Android Studio",80, Level.BASIC)
  	val moduleKotlinI = EducationalContent("Linguagem Kotlin", 180, Level.INTERMEDIARY)
    val moduleApp2 = EducationalContent("Criando seu primeiro APP em kotlin", 150, Level.INTERMEDIARY)
  	val moduleAndroidStudioI = EducationalContent("Fundamentos Multiscreen", 180, Level.INTERMEDIARY)
    val modulePublicando = EducationalContent("Publicando seu App na Google Play", 113, Level.BASIC)
    val moduleConteudoBonus = EducationalContent("Conteudo Bonus", 118, Level.INTERMEDIARY)
   
	val contentList = mutableListOf<EducationalContent>()
        
        contentList.add(moduleBoasVindas)
        contentList.add(moduleInstalacao)
  		contentList.add(moduleKotlinB)
        contentList.add(moduleInstalacaoB)
  		contentList.add(moduleAndroidStudioB)
        contentList.add(moduleApp)
    	contentList.add(moduleKotlinI)
        contentList.add(moduleApp2)
  		contentList.add(moduleAndroidStudioI)
        contentList.add(modulePublicando)
        contentList.add(moduleConteudoBonus)
        
   
    val Danilo   = Users("Danilo","Siqueira",    "danilo.sigma@gmail.com", Post.STUDENT)
    val Fernanda = Users("Fernanda","Menezes", "milla.me@gmail.com", Post.STUDENT)
    val Diogo    = Users("Diogo", "Menezes", "diogo@gmail.com", Post.STUDENT)
    val Rodrigo  = Users("Rodrigo","Vasques",   "rodrigovas@gmail.com", Post.TEACHER)
   
    val androidTraining = Formation("Formação Android Developer", contentList, Level.INTERMEDIARY)
     
    androidTraining.addUser(Danilo)
    androidTraining.addUser(Fernanda)
    androidTraining.addUser(Diogo)
    androidTraining.addUser(Rodrigo)
    
   
    
   
  	println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
    println("|${androidTraining.nome} - ${androidTraining.level}|")
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
   
    println("Grade do curso")
    println(androidTraining.printEducationalContent())
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
   
    println("Alunos inscritos no curso")
    println(androidTraining.getAddUser())
    println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
    
    println("Alunos que finalizaram o curso")
    println(androidTraining.getAddUsers2())
    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
}