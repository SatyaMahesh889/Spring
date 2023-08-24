// Write your code here
package com.example.player.repository;

import java.util.*;

import com.example.player.model.Player;

public interface PlayerRepository {
  ArrayList<Player> getPlayer();
  Player getPlayerById(int playerId);
  Player addPlayer(Player player);
  Player updatePlayer(int playerId,Player Player);
  void deletePlayer(int playerId);
} 