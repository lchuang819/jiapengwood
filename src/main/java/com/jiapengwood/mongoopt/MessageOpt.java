package com.jiapengwood.mongoopt;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import com.jiapengwood.model.MessageData;
import com.jiapengwood.mongorepo.MessageRepo;

@Component
public class MessageOpt implements MessageRepo {

	@Autowired
    private MongoTemplate mongoTemplate;
	
	@Override
	public List<MessageData> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MessageData> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MessageData> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MessageData> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MessageData> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MessageData> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MessageData> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<MessageData> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(MessageData arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends MessageData> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(String arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existsById(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<MessageData> findAllById(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<MessageData> findById(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MessageData> S save(S arg0) {
		mongoTemplate.save(arg0);
		return null;
	}

	@Override
	public <S extends MessageData> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends MessageData> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends MessageData> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends MessageData> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
