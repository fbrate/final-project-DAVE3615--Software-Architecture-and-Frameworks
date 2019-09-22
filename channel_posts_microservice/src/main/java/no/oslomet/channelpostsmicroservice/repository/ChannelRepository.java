package no.oslomet.channelpostsmicroservice.repository;

import no.oslomet.channelpostsmicroservice.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelRepository extends JpaRepository<Channel, String> {
}
