import request from '@/utils/request'

export function listFood() {
  return request({
    url: '/food/list',
    method: 'get',
  })
}

export function FoodList(currentPage,pageSize) {
  return request({
    url: '/food/page/'+currentPage+'/'+pageSize,
    method: 'get',
  })
}

export function FoodDetail(id) {
  return request({
    url: '/food/detail/'+id,
    method: 'get',
  })
}

export function createFood(data) {
  return request({
    url: '/food/add',
    method: 'post',
    data
  })
}

export function updateFood(data,id) {
  return request({
    url: '/food/update/'+id,
    method: 'put',
    data
  })
}

export function deleteFood(id) {
  return request({
    url: '/food/delete/'+id,
    method: 'delete',
  })
}
