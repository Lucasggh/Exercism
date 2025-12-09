
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();// cria um clone real do parametro na memoria, e nao somente um ponteiro, gerando segurança e estabilidade ja que this.birdsPerDay é final, se tirar .clone(), this.birdsPerDay aponta para o endereço de memoria do parametro passado, e se ele (parametro) for modificado, this.birdsPerDay tambem é modificado(quebrando o principrio de encapsulameto)
    }

    public int[] getLastWeek() {
        return birdsPerDay.clone();//se retornar sem clone, o atributo pode ser modificado pois getLastWeek() aponta para this.birdsPerDay, quebrando encapsulamento
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];// java nao tem [-1], tem que usar tamanho -1 pois começa no 0, array com 7 itens = length 7, mas o ultimo indice é 6
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds : birdsPerDay){// birds = elemento, for-each vai pro proximo indice do array automatico
            if(birds == 0){
            return true;
            }
        }return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int soma = 0;
        if(numberOfDays > birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }
        for(int i = 0; i < numberOfDays;i++){
            soma += birdsPerDay[i];
        }return soma;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i=0;i<birdsPerDay.length;i++){
            if (birdsPerDay[i] >= 5){
                busyDays++;
            }
        }return busyDays;
    }
}
