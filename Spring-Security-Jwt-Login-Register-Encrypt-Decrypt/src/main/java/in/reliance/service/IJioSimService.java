package in.reliance.service;

import java.util.List;

import in.reliance.entity.JioSim;

public interface IJioSimService {
public JioSim saveSim(JioSim jio);
public List<JioSim> getAllSims();
}
