public class SmartTv{
boolean ligada = false;
int canal = 1;
int volume = 25;

public void ligar(){
    ligada = true;
}

public void desligar(){
    ligada = false;
}

public int aumentarVolume(){
    volume = volume + 1;
    return volume;
}

public int diminuirVolume(){
    volume = volume -1;
    return volume;
}


}