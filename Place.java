class Place {
  String place;
  int population;
  String capital;

  Place(String aPlace, int aPopulation, String aCapital) {
    place = aPlace;
    population = aPopulation;
    capital = aCapital;
  }

  String getPlace(){
    return place;
  }

  int getPopulation() {
    return population;
  }

  String getCapital() {
    return capital;
  }
}